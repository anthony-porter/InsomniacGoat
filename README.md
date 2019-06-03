# InsomniacGoat

### Concept
Create an application that makes it easier for NBA fans to decide who the greatest basketball player of all time is (G.O.A.T).

### Motivation
The motivation of this project is to be exposed to modern android frameworks, idioms, and design patterns that I don't get to use in my day job.

### Goals
  * Get more comfortable with MVVM in Android
  * Use Kotlin Coroutines
  * Use Room Database
  * Learn how to correctly use a repository
  * Get more comfortable with Kotlin
  * Learn more about databinding
  * Learn more about implementing dependency injection
### Challenges
* Finding a good API for NBA data.
* Finding resources for learning the basics
### Next Steps
1. Update J-Docs to existing classes
2. Implement basic API
3. Find a good way to mock the api
4. Implement basic data persistance
5. Implement basic data retrieval
5. ~~Find a good NBA API to replace mock API~~
6. Add dependency injection
7. Add unittests
8. Add Instrumentation tests (Robolectric + Espresso)

##### Running ideas, questions, spikes, etc.
* Can an HttpInterceptor be used to set the response for data mocking purposes?
  * Could said interceptor be used to read data from a file. what is the effort level?
  
##### Insomniac GOAT glossary
  * GOAT seasons- years with goat level statistics and wins. Defined by user
  * Ideal GOAT season count- number of goat level seasons to consider. 
  * GOAT season score- comparison of a season to a GOAT season
  * Big 5 score- combined weighted score of points, assists, rebounds, blocks, and steals