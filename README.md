# springboot-graphql-example
[![Build Status](https://travis-ci.org/gregwhitaker/springboot-graphql-example.svg?branch=master)](https://travis-ci.org/gregwhitaker/springboot-graphql-example)

An example of a [GraphQL](http://graphql.org/) service implemented in [Spring Boot](https://projects.spring.io/spring-boot/).

The example exposes a GraphQL API that allows the user to store and query `Link` objects containing a url and a short description.

## Running the Example
1. Start the example by running the following Gradle command:

        $ ./gradlew bootRun 

2. Once the application has started, use the embedded [GraphiQL](https://github.com/graphql/graphiql) environment to interact with the API at [http://localhost:8080/graphiql](http://localhost:8080/graphiql).

3. To list all `Link` objects execute the following graphql query in the [GraphiQL interface](http://localhost:8080/graphiql):

        {
          allLinks {
            url
            description
          }
        }
        
    You should see the following response:

        {
          "data": {
            "allLinks": [
              {
                "url": "https://www.netifi.com",
                "description": "Autonomous microservices platform"
              },
              {
                "url": "http://howtographql.com",
                "description": "Your favorite GraphQL page"
              },
              {
                "url": "http://graphql.org/learn/",
                "description": "The official docks"
              }
            ]
          }
        }

## Bugs and Feedback
For bugs, questions, and discussions please use the [Github Issues](https://github.com/gregwhitaker/springboot-graphql-example/issues).

## License
MIT License

Copyright (c) 2018 Greg Whitaker

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.