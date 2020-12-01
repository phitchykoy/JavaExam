# JavaExam

## GET/orders

## Request Structure (Json view)
```
[    
  {
    "orderid": String
  }
]
```

## Response Structure (Json view)

```
{
  "price": Integer,
  "discount": Integer,
  "total_price": Integer,
  "items": [
    {
      "bookid": String,
      "name": String,
      "price": Integer,
      "amount": Integer
    }
  ]
}
```