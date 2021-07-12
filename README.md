<h1 align="center"> Functional Java </h1> <br>

## Table of Contents

- [Introduction](#introduction)
- [This&nbsp;respository](#thisrepository)
- [Dependencies](#dependencies)
- [Run&nbsp;Code](#runcode)
- [Platzi&nbsp;Course](#platzicourse)
- [Notes](#notes)

## Introduction

Functional programming is a programming paradigm that is based on the development of functions that focus more on solving problems and not so much on how to solve them. There are some benefits of this type of programming:
- Readability. The functions are more explicit.
- Testing. It is easier to run tests when the code is separated into functions
- Concurrency. Simultaneous processes can be released from a single function.
- More defined behaviors. The code being in functions makes it easier to read and understand what each function does.
- Better management of states. The only thing that matters is whether or not you have the data.

From version 8 Java included features of functional programming, this through java.util.functions

#### Function
The function is a type of data that can operate on another and thus obtain a new one. The functions can be classified mainly into two:
- Pure functions. They are all those that generate the same result for the same parameters.
- Impure functions. They are those that generate side effects, such as:
* Read / create / modify / delete files
* Read / write a database
* Send / receive data from the network
* Modify an object / variable used by other functions.


## This&nbsp;repository
This repository contains the project that was developed throughout the Functional Java course. The purpose of the project is to understand the concepts related to the paradigm of functional programming. The courses shows how to use java.util.functions, understanding and exemplifying the next concepts:
- Function
- Predicate
- Consumer and Supplier
- Operators and BiFunction
- Single Abstract Method (SAM)
- Reference operator
- Inference
- Lambda
- Deault methods
- Chaining
- Composition
- Streams
- Collectors

Besides, the projects contains a CLI application that searchs jobs. This project implements functional programming to consume one of the GitHub APIs.

## Dependencies
- Install OpenJDK 11
- Install Intellj or another IDE thats supports OpenJDK 11 and contains gandler

## Run&nbsp;Code
You can only run these projects using IntelliJ or another IDE what support gradle, for job search you have to use the gradle and select application -> run.


## Platzi&nbsp;Course

Check out [Platzi's Functional Java course](https://platzi.com/clases/java-funcional/).


## Notes

Most commits correspond to sections of the course in which the project code was changed.
