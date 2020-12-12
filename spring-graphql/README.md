#### End Point: http://localhost:8080/graphiql
### 1 - Basic Hello Example
    {
        helloWithParameter(name:"Harun")
    }
### Result
    {
        "data": {
            "helloWithParameter": "Hello Harun"
        }
    }

### 2 - Get All Customers
    {
        getAllCustomers{
            id,
            name,
            email
        }
    }
#### Result
    {
        "data": {
            "getAllCustomers": [
                {
                "id": "1",
                "name": "harun",
                "email": "ugur.harun@yandex.com"
                },
                {
                "id": "2",
                "name": "rıdvan",
                "email": "ridvan.dilmen@ntv.com.tr"
                },
                {
                "id": "3",
                "name": "murat",
                "email": "morat.kosova@ntv.com.tr"
                }
            ]
        }
    }
### Get Customer By CustomerId
    {
        getCustomerById(id:1){
            id,
            name,
            surname,
            email
        }
    }
### Result
    {
        "data": {
            "getCustomerById": {
                "id": "1",
                "name": "harun",
                "surname": "ugur",
                "email": "ugur.harun@yandex.com"
            }
        }
    }