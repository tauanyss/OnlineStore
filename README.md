# OnlineStore

## Main Class

I provided a main class with one test case to check if the code is running well.

## Bonus Answer

The project was made for a shopping cart. 
However, to change it to support multiple carts, each cart would be assigned an identifier and the Cart attribute in the Store would be changed to an List of Carts.

With the implementation of the ID, all methods related to the cart would change, so that the items, when displayed and calculated, belong to the correct cart. 
This means that the "addItemToCart", "GetCartItems", "GetCartTotal" methods would change. 
In addition to creating a new method to check whether the cart exists.