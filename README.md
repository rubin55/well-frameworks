# Well, frameworks..

This project aims to be a functional comparison of various application
frameworks. In the subdirectories you'll find ready-to-build implementations
of the functional specification defined below.

The idea is to compare non-functional properties of these frameworks, things
like executable size (due to framework scope or transient dependencies for
example), system resource usage, conceptual complexity, and probably a few
other things I can come up with.

Next to a few well-known frameworks, I will opt to code "sans-framework" in
at least a few languages. The goal of that is to actually get a feel of what
it means to do it yourself as opposed to letting a framework do the
heavy-lifting for you (how heavy is that lifting anyway).

In short, the goal is to use the framework or the standard library of a given
language to implement the the functional specification defined below.

## Functional specification

So what will we build? Let's describe that in one paragraph:

*We'll build a self-contained executable that runs an HTTPS server which serves
a basic-auth supporting REST interface which implements GET and POST for the
retrieval and modification of a list of humans, which are persisted in some
way or the other.*

So basically, we want to be able to:

 * `GET https://localhost:8080/humans` (returns a list of humans)
 * `GET https://localhost:8080/humans/rubin` (returns a specific human)
 * `POST https://localhost:8080/humans/freek` (modify or create a human)

The implementer (now just [me](https://github.com/rubin55/) but mayhaps more
contributors some day?) creates a directory within this project with a
descriptive name. This directory should contain a README.md which describes
the framework used, the implementation and contains the build instructions to
create the artifact (an executable file or archive of some sort which is
directly runnable).

**Note 1:**  It's considered ok to install a runtime, like Python or Java to run the
code but not to install any dependencies like libraries or databases by hand -
the application should be as self-contained as possible. If a given
implementation produces a real executable binary, that's bonus points :-).

**Note 2:** It's also considered ok to use a library that does some basic thing,
like HTTP serving or event processing. When I use something (outside of the
framework or standard library), I'll mention the primary dependencies in the
table below.

## Frameworks and implementations

So which ones to start with? Let's see:


| Language     | Framework used | Dependencies    | Subdirectory     | Done |
| ------------ |--------------- | --------------- | ---------------- |:----:|
| Java         | None           | n/a             | /java-none       |  ✗  |
| Java         | Bootique       | n/a             | /java-bootique   |  ✗  |
| Java         | Spring Boot    | n/a             | /java-springboot |  ✗  |

## Results

Nothing to see here yet, move along..
