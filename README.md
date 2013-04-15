# A TDD example using prime detection and prime factorization

## Introduction

This repo contains step-by-step solutions to prime detection and prime factorization. Each step in the 
red-green-refactor cycle has got its own commit and its own tag. The tags are named after the current 
phase (red|green|refactor) appended with a number. No code are on master. Prime detection is implemented
in the branch called is-prime while factorization is a branch of that branc called prime-factors.
Prime factors got an eclipse project.

## Guard

If trying this out without an IDE there is a guard file that detects changes and then recompiles and runs
the tests. You need ruby and `gem install guard`. Start it with `guard start -i` and it will run in the
background whenever a file is changed.
