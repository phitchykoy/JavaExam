# JavaExam

## [POST] /orders

## Request Structure 
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

### Request Example
```
[    
  {
    "bookid": 1,
    "amount": 2
  },  
  {
    "bookid": 3,
    "amount": 1
  }
]
```

## Response Structure

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
## Response Example
```
{
  "order_id": 1,
  "price": 300,
  "discount": 10,
  "total_price": 290,
  "items": [
    {
      "bookid": 1,
      "name": "Harry Potter Part1",
      "price": 100,
      "amount": 2
    },
    {
      "bookid": 3,
      "name": "Harry Potter Part2,
      "price": 100,
      "amount": 1
    }
  ]
}
```
