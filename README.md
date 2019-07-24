SOLID PRINCIPLES TASKS:
1. Consider the design of the following class, Text that models an editor or editing text and
printing text.
class Text {
String text;
String author;
int length;
String getText() { ... }
void setText(String s) { ... }
String getAuthor() { ... }
void setAuthor(String s) { ... }
int getLength() { ... }
void setLength(int k) { ... }
/*methods that change the text*/
void allLettersToUpperCase() { ... }
void findSubTextAndDelete(String s) { ... }
/*method for formatting output*/
void printText() { ... }
}
