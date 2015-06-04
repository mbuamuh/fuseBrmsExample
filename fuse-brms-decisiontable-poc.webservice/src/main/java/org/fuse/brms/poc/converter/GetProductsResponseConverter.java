package org.fuse.brms.poc.converter;

import org.apache.camel.Converter;

import poc.decisiontable.fuse.brms.displayproduct.GetProductsRequest;
import poc.decisiontable.fuse.brms.displayproduct.GetProductsResponse;
import poc.decisiontable.fuse.brms.displayproduct.ProductDetails;
import poc.decisiontable.fuse.brms.displayproduct.UserDetails;

@Converter
public class GetProductsResponseConverter {
	
	 private GetProductsResponseConverter() {   
	    }
	 
	 @Converter
	 public static GetProductsResponse convert(GetProductsRequest input){
		 GetProductsResponse response = null;
		 
		 if(input==null){
			 return response;
		 }
		 
		  response = new GetProductsResponse();
		  
		  ProductDetails product = input.getProduct();
		  if(product!=null){
		response.setProduct(product );
		  }
		
		 UserDetails user = input.getUser();
		  if(user!=null){
			  response.setUser(user);
		  }
		  
		 return response;
	 }

}
