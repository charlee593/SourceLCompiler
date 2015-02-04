#! /bin/sh

WHERE=.
PASS_PATH=tests/passing
FAIL_PATH=tests/failing

echo
echo Testing legal codes
echo

for i in $(ls $PASS_PATH); do
echo ------------------------------------------------------------------------------
echo Testing $i:
java -jar $WHERE/dist/compiler488.jar  $PASS_PATH/$i > output
done

echo
echo '******************************************************************************'
echo
echo Testing illegal codes
echo

for i in $(ls $FAIL_PATH); do
echo ------------------------------------------------------------------------------
echo Testing $i:
java -jar $WHERE/dist/compiler488.jar  $FAIL_PATH/$i > output
done 