# Generate a file with random unique strings

To run an app:
`./mvnw clean install`
`./mvnw spring-boot:run`

To test an app:
`./mvnw test`

## Get results

### Request

`GET /v1/strings`

	curl -i -H 'Accept: application/json' http://localhost:8080/v1/strings

### Response

	TBA

## Check how many jobs are running

### Request

`GET /v1/jobs`

	curl -i -H 'Accept: application/json' http://localhost:8080/v1/jobs

### Response

	TBA

## Create new job

### Request

`POST /v1/jobs`

	curl -i -H 'Accept: application/json' -d 'input=["a","b","c","d","e"]&amount=3&lengthmin=1&lengthmax=3'

### Response

	TBA

