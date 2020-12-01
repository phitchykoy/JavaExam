# JavaExam

## POST/orders

## Request Structure (Json view)
```
[    
  {
    "bookid": String,
    "amount": Integer
  },  
  {
    "bookid": String,
    "amount": Integer
  }
]
```

## Response Structure (Json view)

```
{
  "order_id": Integer,
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
