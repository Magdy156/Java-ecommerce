## Spring Boot App - ecommerce
-----------------------------------------------
#### draw.io link -> https://drive.google.com/file/d/14BIMldLk9kyLlduhX1duwbqXwSw-P1QA/view?usp=sharing
-----------------------------------------------
#### Wallet Microserivce -p 8000
-----------------------------------------------

##### User register Post(/api/v1/users/register)
```
{
    "name": "randomName",
    "password":"pass",
    "email": "randomName@gmail.com"
}
```
##### User login Post(/api/v1/users/login)
```
{
    "email": "randomName@gmail.com",
    "password":"pass"
}
```
##### User allUsers Get(/api/v1/users)
```
```

##### Wallet create Post(/api/v1/wallet/create/{userId})
```
```

##### Wallet login Get(/api/v1/wallet/{userId})
```
```

##### Transaction cash In Post(/api/v1/transaction/cashin/{walletId}?amount={amount})
```
```

##### Transaction cash Out Post(/api/v1/transaction/cashout/{walletId}?amount={amount})
```
```

##### Transaction Transaction History of A Wallet Get(/api/v1/transaction/{walletId})
```
```
-----------------------------------------------
#### Shop Microserivce -p 8001
-----------------------------------------------
##### Product creation Post(/api/v1/products/create)
```
{
    "name": "randomName",
    "description":"randomDes",
    "price": 50
}
```

##### Get all products Get(/api/v1/products)
```
```

##### Get one product Get(/api/v1/products/{id})
```
```

##### Create Cart Post(/api/v1/cart/create/{userId})
```
```

##### add item to Cart Post(/api/v1/cart/{userId}/add?productId={productId}&quntity={quantity})
```
```
##### show Cart contents Get(/api/v1/cart/{userId})
```
```

##### clear Cart contents Delete(/api/v1/cart/{userId}/clear)
```
```
