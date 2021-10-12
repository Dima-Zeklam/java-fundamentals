# JavaScript linter 
linter generate an error message when a line code in js files doesn’t end in a semi-colon.

**The error message will shown like this based on line number the error will occure in :**

> Line 3: Missing semicolon.

### The Error will not be shown if : 
* if there is { or  }
* if there *if* statement or *else* statement
* an empty line.
otherwise error will occur.

### Do testing for different 5 files
1. Test the linter on a file that contains no errors.
2. Test the linter on a file that contains one error.
3. Test the linter on a file that contains few errors.
4. Test the linter on a file that contains many errors.
5. Test the linter on an empty file.

