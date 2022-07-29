

1)	Create / Signup User
POST http://localhost:8081/api/users/signup
RequestBody
{
    "email":"john@gmail.com",
    "firstName":"John",
    "lastName":"Karry",
    "password":"1234"
}

Response  - 201 Created
It Returns JWT token - eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJqb2huQGdtYWlsLmNvbSIsImV4cCI6MTY1ODg3OTQ1M30.cDaG47ver7nQgrwQjbh4NhdJczvEjdS8OR7OyqX-GeA

2)	Login 
POST http://localhost:8081/api/users/login
Request Body
{
    "email":"john@gmail.com",
    "password":"1234"
}

Response:
It Returns JWT token - eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJqb2huQGdtYWlsLmNvbSIsImV4cCI6MTY1ODg3OTQ1M30.cDaG47ver7nQgrwQjbh4NhdJczvEjdS8OR7OyqX-GeA






Pass with Authorization Type (Bearer token)   = Bearer  + JWT token

3. Create Contact
http://localhost:8081/api/contacts
requestBody 
{
    "firstName": "Tom",
    "lastName": "Brad",
    "phoneNumber": "9134657690",
    "addressLine": "M Geller,495 Grove Street",
    "cityName": "New York",
    "birthDate": "1991-07-10",
    "email": "tom@gmail.com"
}
Response: HTTP status code – 201

4.Get all contact of user (pass auth token for logged in user)
GET http://localhost:8081/api/contacts
Response 200
[
    {
        "firstName": "Tom",
        "lastName": "Brad",
        "phoneNumber": "9134657690",
        "addressLine": "M Geller,495 Grove Street",
        "cityName": "New York",
        "birthDate": "1991-07-10",
        "email": "tom@gmail.com"
    },
    {
        "firstName": "Ram",
        "lastName": "Mote",
        "phoneNumber": "9134657690",
        "addressLine": "495 ABC Street",
        "cityName": "Pune",
        "birthDate": "1991-07-10",
        "email": "ram@gmail.com"
    }
]


5.Get contact by firstName 
GET http://localhost:8081/api/contacts/Tom
Response HTTP 200
{
    "firstName": "Ram",
    "lastName": "Mote",
    "phoneNumber": "9134657690",
    "addressLine": "495 ABC Street",
    "cityName": "Pune",
    "birthDate": "1991-07-10",
    "email": "ram@gmail.com"
}


6.Put – update contact 
http://localhost:8081/api/contacts/{contact_id}

RequestBody:
{
    "firstName": "Shyam",
    "lastName": "Gopal",
    "phoneNumber": "9134657690",
    "addressLine": "M.G Geller,100 Gell Street",
    "cityName": "New York",
    "birthDate": "1990-01-01",
    "email": "shyam@gmail.com"
}


Response :
Http 200
{
    "firstName": "Shyam",
    "lastName": "Gopal",
    "phoneNumber": "9134657690",
    "addressLine": "M.G Geller,100 Gell Street",
    "cityName": "New York",
    "birthDate": "1990-01-01",
    "email": "shyam@gmail.com"
}

7. Delete contact
http://localhost:8081/api/contacts/{contact_id}
Response Http 204 : No content
