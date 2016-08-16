## Hello Cloud Foundry Java Style ##

I felt so good about my first [cloud foundry hello world](https://github.com/codemarc/hello-world-pm) (ruby edition) project that I wanted to rebuild it using java. It has been a while since I last took a good look at the full toolchain ( Last time was a few years ago while I was researching the OpenStack Icehouse release ).  

It is easy to forget that when you buy into the EMC cloud strategy for building and deploying technology you gain access to all the components of the EMC federation. So things like VMWare, Spring Source can easily become part of the story. 

#### Bootstrapping ####
As I was thinking about the second part of the assignment it occurred to me that the cloud foundry cli could have had a simple command that generated my starter hello world app. 
For Java there is a nice website the creates a Spring boot head start **See**: 
[Spring Initializ](http://start.spring.io/).

Great, So I generate a new app using this tool and generate eclipse project and classpath and initial build as followa:

> $ mvn eclipse:eclipse package

I load up the project into eclipse and we are ready to rumble. I locate the @SpringBootApplication annotation and run the main class HelloWorldTcApplication and like
magic I get a spring booted Tomcat instance running on my [http://localhost:8080](http://localhost:8080)





#### Questions to be answered ####

1. 