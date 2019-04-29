# Vaadin Designer testing

Run using `mvn jetty:run` and open [http://localhost:8080](http://localhost:8080) in browser.

## Current issue: empty outline in Designer
![Empty outline](/empty_outline.png)

## Workaround
This can be fixed by commenting out code like this: https://github.com/vesanieminen/Designer-Testing/commit/980a31e7cad0a68bac5c6a4cc684a255a5ed4f5b
