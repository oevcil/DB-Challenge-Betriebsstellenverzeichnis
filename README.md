# DB-Challenge-Betriebsstellenverzeichnis
This is a challenge I was given as part of an application.

## Task

Create a program that reads the data from the CSV file and makes it available via a REST endpoint. The endpoint should be queried with the abbreviation of a site and return the site data as a JSON object.

## Tip

You can use Java and SpringBoot very well to solve this task. However, you can also use other technologies.

Example request:
`.../operations/aamp`
Example response:
`HTTP-STATUS: 200 
{
  Name: Hamburg Anckelmannsplatz      
  Kurzname: Anckelmannsplatz  
  Typ: Üst
}`

## Conclusion

This was a very nice and demanding task, which challenged me personally to deal with Spring Boot, Endpoints, Git and Servelets in a very short time and to acquire further knowledge. 

## Notes

- Since there was no default given for the code conventions, I mainly used the German language for the code and basic conventions.
My goal is to create a program that roughly follows this flowchart:
![pap-db](https://user-images.githubusercontent.com/70027346/179308462-630724da-e580-4984-808b-b8c419812cb1.PNG)

## Start Guide

To run the program, an argument must be supplied, for example:
`Betriebsstellenverzeichnis.jar D:\IdeaProjects\Betriebsstellenverzeichnis\DBNetz-Betriebsstellenverzeichnis-Stand2021-10.csv`

 

