## [API]Path Parameter / Query Parameter

### Path Parameter

- 특정 리소스 정보를 반환하는 API를 설계할 때, 접근하는 고유한 정보를 변수화 하여 지정해둔 매개변수
- ( 특정 자원(resource, data) 을 가르키는 URL 경로에 가변적인 부분은 변수로 지정해둘 수 있음)
- 서로 다른 데이터지만  resource(자원)의 종류는 동일할 때, path parameter를 이용하여 RESTful한
 API를 구성할 수 있음.

```sql
//GET: Products 특정 리소스의 데이터를 요청하기 위해 사용
GET http://10.58.4.1:8000/products
/* Response 200 OK */
{
	"results" : [
	{
	 "id" : 1,
	 "name" : "사과",
	 "price" : "3000원",
	},
	{
	 "id" : 2,
	 "name" : "딸기",
	 "price" : "5000원",
	}
 ]
}
GET http://10.58.4.1:8000/products/1
/* Response 200 OK */
	{
	 "id" : 1,
	 "name" : "사과",
	 "price" : "3000원",
	}
```

### Query Parameter란

- URL에서 특정 조건을 주고싶을때 사용하는 매개변수 유형
- 같은 API를 호출한다고 해도, 서로다른 조건으로 나열될때.  URL 끝에 **물음표(?) 뒤**에 나타나며, (한개 이상일때) **and 기호(&)**로 구분된 `이름=값` 쌍으로 구성.
```sql
http://localhost:8080/hello?name=Yang
```