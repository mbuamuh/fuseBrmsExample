package org.fuse.brms.poc;


import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.drools.core.command.impl.GenericCommand;
import org.drools.core.command.runtime.BatchExecutionCommandImpl;
import org.drools.core.command.runtime.rule.FireAllRulesCommand;
import org.drools.core.command.runtime.rule.InsertObjectCommand;

import poc.decisiontable.fuse.brms.displayproduct.GetProductsRequest;
import poc.decisiontable.fuse.brms.displayproduct.ProductDetails;
import poc.decisiontable.fuse.brms.displayproduct.UserDetails;


public class FireRulesCommand {

    public void insertAndFireRules(Exchange exchange) {
        Message in = exchange.getIn();
        GetProductsRequest getProductsRequest = in.getBody(GetProductsRequest.class);
       ProductDetails product = getProductsRequest.getProduct();
       UserDetails user = getProductsRequest.getUser();

        BatchExecutionCommandImpl command = new BatchExecutionCommandImpl();
        final List<GenericCommand<?>> commands = command.getCommands();
        commands.add(new InsertObjectCommand(product, "product"));
        commands.add(new InsertObjectCommand(user, "user"));
        commands.add(new FireAllRulesCommand());
       

        in.setBody(command);
    }

}
