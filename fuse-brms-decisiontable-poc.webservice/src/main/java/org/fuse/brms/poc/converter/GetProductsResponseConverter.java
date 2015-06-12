package org.fuse.brms.poc.converter;

import org.apache.camel.Converter;

import poc.decisiontable.fuse.brms.displayproduct.GetProductsRequest;
import poc.decisiontable.fuse.brms.displayproduct.GetProductsResponse;
import poc.decisiontable.fuse.brms.displayproduct.ProductDetails;
import poc.decisiontable.fuse.brms.displayproduct.UserDetails;
import org.drools.core.runtime.impl.ExecutionResultImpl;

@Converter
public class GetProductsResponseConverter {
	
	 private GetProductsResponseConverter() {   
	    }
	 
	 @Converter
	 public static GetProductsResponse convert(ExecutionResultImpl executionResultImpl){
		 GetProductsResponse response = null;
		 if (executionResultImpl==null){
			 return response;
		 }
		 ProductDetails product = (ProductDetails) executionResultImpl.getValue("product");
		 UserDetails user = (UserDetails) executionResultImpl.getValue("user");
		 GetProductsRequest input = null;
		 response = new GetProductsResponse();
		 if(product!=null){
				response.setProduct(product );
				  }
		 
		 if(user!=null){
			  response.setUser(user);
		  }
		
		 
//		 if(input==null){
//			 return response;
//		 }
//		 
//		  response = new GetProductsResponse();
//		  
//		  ProductDetails product = input.getProduct();
//		  if(product!=null){
//		response.setProduct(product );
//		  }
//		
//		 UserDetails user = input.getUser();
//		  if(user!=null){
//			  response.setUser(user);
//		  }
		  
		 return response;
	 }

}
