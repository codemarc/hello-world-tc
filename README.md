## Hello Cloud Foundry Java Style ##

I felt so good about my first [cloud foundry hello world](https://github.com/codemarc/hello-world-pm) (ruby edition) project that I wanted to rebuild it using java. It has been a while since I last took a good look at the full toolchain ( Last time was a few years ago while I was researching the OpenStack Icehouse release ).  

It is easy to forget that when you buy into the EMC cloud strategy for building and deploying technology you gain access to all the components of the EMC federation. So things like VMWare, Spring Source can easily become part of the story. 

#### Bootstrapping ####
As I was thinking about the second part of the assignment it occurred to me that the cloud foundry cli could have had a simple command that generated my starter hello world app. 
For Java there is a nice website the creates a Spring boot head start **See**: 
[Spring Initializ](http://start.spring.io/).

Great, So I generate a new app using this tool and generate eclipse project and classpath and initial build as followa:

> $ mvn eclipse:eclipse package

I load up the project into eclipse and we are ready to rumble. I locate the @SpringBootApplication annotation and run the main class HelloWorldTcApplication and like magic I get a spring booted Tomcat instance running on my [http://localhost:8080](http://localhost:8080)

#### Spring security ###
And now I face and interesting security challenge. I want to override the builtin default security with one of my own:

~~~
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
            auth.inMemoryAuthentication()
                .withUser("hello").password("world").roles("USER");	
    }
}
~~~

#### Package and Push ####

To deploy this version to cloud foundry the documentations says you need to push a war file.
A simple upgrade to the packging attribute of my pom.xml to build a war:

~~~
$ mvn package 
$ cf push hello-world-tc -p target/hello-world-tc-0.0.1-SNAPSHOT.war
~~~

and now we can test this at: [http://hello-world-tc.cfapps.io/](http://hello-world-tc.cfapps.io/)

<br/><br/><br/>

