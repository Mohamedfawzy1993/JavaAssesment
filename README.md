# JavaAssesment
JavaAssesment Solution

1- While implementing a REST API, what options do we have to add a functionality that allows clients to determine whether the content of a REST resource has changed? For example, if a client has retrieved a resource (like /books/1), and the next time the client wants to retrieve the resource only if its content has changed.

Answer: we can implement signature/checksum , where response will be hashed, and next time you call the api you compare the returned hash to know if it match "content not changed" or not match "content changed"


2- We need a REST endpoint that can publish responses in both JSON as well XML (one format at a time). How can we achieve this? And how can the client indicate which format the response is required in?

- Server should configure "Content-type" header in the response returned for json it should be application/json , for xml it can be text/xml or application/json
- the client should send header "Accept" which indicate the response format expected
- Spring have the option to configure @RequestMapping(consume="", produce="") which indicate which type the api will consume and produce


3- While connecting to a URL, how can we specify that we don’t want the cached version in response and that we prefer the response in the Brotli data compression algorithm?

- Set Cache Control header in request to no cache, and set Content Encoding header to whatever type needed

4- Let's say we call a Java method, the method internally calls 4 other methods based on different conditions. How can we test the order of method executions?

- Use Mockito Verify , for the order we can use inorder verify

5- When the development team works on an existing codebase, how do you ensure that the new changes won’t break the existing code?

 - use different branches for new changes
 - cover the old code with unit and integration tests, so you can execute the tests against the new code to make sure it still works

6- Let’s analyze the following code and share your thoughts on whether this code can be improved.

not mentioned clearly what meant by improve, but I always prefer using streams for better readability and performance

```
 static void printRandomGreetingMessage() {
        List<String> messageStore = Arrays.asList("Hi, welcome", null, "Good day ");
        Collections.shuffle(messageStore);
        messageStore.stream()
            .map(val -> Objects.nonNull(val) ? val.trim() : createResponseForEmptyMessage())
            .findAny()
            .ifPresent(System.out::println);
    }
    static String createResponseForEmptyMessage() { return "the message was empty";}
```
7- We have the following Country record. Let’s write a code snippet to fetch and update this record from this endpoint - https://get.geojs.io/v1/ip/country.json
public record Country(String name, String country, String ip) { }


Answer: https://github.com/Mohamedfawzy1993/JavaAssesment/tree/main/src/main/java/com/java/assesement/country

8- We have this string representation of an object,

Answer : https://github.com/Mohamedfawzy1993/JavaAssesment/tree/main/src/main/java/com/java/assesement/stringparse

