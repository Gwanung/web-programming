<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="dto.ProductRepository" %>
    <%@ page import="dto.Product" %>
    <%
    request.setCharacterEncoding("UTF-8");
   String productID = request.getParameter("productID");
   String name = request.getParameter("name");
   String unitPrice = request.getParameter("unitPrice");
   String description = request.getParameter("description");
   String manufacturer = request.getParameter("manufacturer");
   String category = request.getParameter("category");
   String unitsInStock = request.getParameter("unitsInStock");
   String condition = request.getParameter("condition");
   
   Integer price;
   if(unitPrice.isEmpty())
	   price = 0;
   else
	   price = Integer.valueOf(unitPrice);
  
   long stock;
   if(unitsInStock.isEmpty())
	   stock = 0;
   else
	   stock = Long.valueOf(unitsInStock);
   
   ProductRepository dto = ProductRepository.getInstance();
   Product newProduct = new Product();
   
   newProduct.setProductID(productID);
   newProduct.setPname(name);
   newProduct.setUnitPrice(price);
   newProduct.setDescription(description);
   newProduct.setManufacturer(manufacturer);
   newProduct.setCategory(category);
   newProduct.setUnitsInstock(stock);
   newProduct.setCondition(condition);
   dto.addProduct(newProduct);
   
   response.sendRedirect("products.jsp");
   
    %>
