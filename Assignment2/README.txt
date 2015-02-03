This directory contains a minimal compiler skeleton that
is sufficient to develop the programming language grammar
for Assignment 2.

The files in this directory are:

build.xml 		an ANT build script for building the scanner, 
			parser and the driver program.
			Use:
			  'ant help' to get the list of targets
			  'ant gettools' to download JCup and JFlex DO THIS FIRST
			  'ant compile' or 'ant compiler488' to build everything
			  'ant dist' to create a run-time Jar
			
bin			Binary directory, all compiler class files go here

doc			Documentation directory
doc/javadoc		Javadoc for the compiler skeleton

dist			Distribution directory.  Holds  compiler488.jar file
			produced by 'ant dist'

lib			Library directory (see ant gettools)
			After 'ant gettools' it contains a local copy of the
			libraries required to build the scanner and parser.

compiler488/compiler

	Compiler488.java	a very simple driver program that invokes
				the scanner/parser on a file.

compiler488/parser

	csc488.cup		An input file for the JavaCUP parser generator.
				There's space at the end for you to add your
				grammar for Assignment 2.

	csc488.flex	An input file for the JFlex scanner generator.
			The file as provided is a correct scanner for the
			project language.  You should NOT change this file.

To run the test driver first build a distribution using 'ant dist',
then run using 'java -jar dist/compiler488.jar  inputFile'
A shell script  RUNCOMPILER.sh  that does this has been provided.

=======================================================================================

Marking Scheme for Assignment 2

-  Package and submission			 5%
   Was the file/directory structure correct?
   Did the RUNALLTESTS.sh work correctly?

-  Grammar  quality/readability			40%
   Did they appear to correctly handle issues in the reference grammar
   statement vs. list of statements,  precedence of expressions  etc.
   Was the grammar complete, correct, readable?

-  Documentation				20%
   Did they document
   - their grammar design ?		
   - their testing ?			 
   - who did what ?			 

-  The teams testing				25%
   - how thoroughly did they test their grammar?
   - did they test with syntacticaly correct programs?
   - did they test handling of syntax errors?

- Our testing					 10%
  Our testing of a compiler built using each teams  csc488.cup file
  Did the compiler build successfully?
  Does it pass all of our tests?

=======================================================================================

  What to submit / How to submit Assignment 2

1) Submit  tar ball named  csc488h.A2.XY.tar  (where XY is your team number).
   If more than one tar ball is submitted by a team we will use the most
   recent one.  Like this:

   submit -c csc488h  csc488h.A2.XY.tar

   See "man submit" on CDF for more information.

The tar ball should contain:

a) A README.A2 file that describes what each team member did for this assignment

b) Your  csc488.cup file

   We will use this file with the Assignment 2 starter code to build a parser
   and run that parser on our test cases.

c) A design document that describes how you designed your csc488.cup file.
   Explain the issues that arose with the source language reference grammar
   and how you resolved those issues

d) A tests directory containing all of the test cases that you used to
   test your compiler.  There should be two subdirectories
   tests/passing    tests for the correct operation of the parser (legal programs)
   tests/failing    test to demonstrate handling of syntax errors (invalid programs)

   Include a shell script  RUNALLTESTS.sh  that will run your compiler against
   all of your test cases.   Model it after the RUNCOMPILER.sh file we provided.
   We'll adjust the location of your compiler (e.g. WHERE) for our testing.

   Suggestion from Peter:  change  WHERE  to  WHERE=`dirname $0`  and
   you can run the compiler anywhere using the RUNCOMPILER.sh in the A2 directory tree

e) A document describing how you tested your csc488.cup file.
   Include an index with a one sentence description of each test case.

No hardcopy is required for this assignment.

NOTES

1) The file/directory  names and the name of the tarball itself are
   *case sensitive*.  Please try to hard to get the names exactly
    right so you don't break our automated processing scripts.

2) The documents you submit in the tarball should be in a format that is 
   easy to read on CDF.  In general this means  text files or PDF files.
   Do not submit Microsoft Word files.
