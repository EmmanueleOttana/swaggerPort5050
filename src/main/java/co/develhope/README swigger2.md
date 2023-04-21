# Esercizio - Spring Boot - Swagger 2
* scrivere un'applicazione Spring Boot che utilizzi le seguenti dipendenze:
  * `Lombok`
  * `Spring Boot DevTools`
  * `Web primaverile`
* aggiungi solo 1 dipendenza maven necessaria per `springfox`
* aggiungi la corretta configurazione dell'app `ant_path_matcher`
* crea un'entità chiamata "ArithmeticOperation" che ha i seguenti valori (descritti):
  * una stringa `nome`
  * un numero intero `minNumberOfOperands`
  * una stringa `descrizione`
  * un array di stringhe `proprietà`
* fornire un controller predefinito per il root con un messaggio di benvenuto (ad es. per qualcuno che visita `localhost:5050`)
* fornire un controller chiamato `MathController` dalla mappatura `/math` dove descrivi:
  * `mapping=""`: `welcomeMathMsg()`
  * `mapping="division-info"`: che restituisce una nuova `ArithmeticOperation` con tutti i dettagli sulla divisione
  * `mapping="moltiplicazione"`: che accetta i parametri int e restituisce il valore della moltiplicazione
  * `mapping=square/{n}`: che restituisce il quadrato della `n`
* documenta ogni metodo che può essere chiamato tramite API
* eseguire l'applicazione Spring sulla porta `5050`

# Exercise - Spring Boot - Swagger 2
* write a Spring Boot application that uses the following dependencies:
  * `Lombok`
  * `Spring Boot DevTools`
  * `Spring Web`
* add just 1 necessary maven dependency for `springfox`
* add the right `ant_path_matcher` app configuration
* create an entity called `ArithmeticOperation` that has the following (described) values:
  * a string `name`
  * an integer `minNumberOfOperands`
  * a string `description`
  * an array of strings `properties`
* provide a default controller for the root with a welcome message (e.g. for someone who visit `localhost:5050`)
* provide a controller called `MathController` fro the mapping `/math` where you describe:
  * `mapping=""`: `welcomeMathMsg()`
  * `mapping="division-info"`: that returns a new `ArithmeticOperation` with all the details about the division
  * `mapping="multiplication"`: that takes to int parameters and returns the multiplication value
  * `mapping=square/{n}`: that returns the square of the `n`
* document every method that can be called via API
* run the Spring application on port `5050`
