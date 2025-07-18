/*
FinalClass


*/

// Java17
package com.puppycrawl.tools.checkstyle.checks.design.finalclass;

public record InputFinalClassNestedInRecord(int a) {

    record b() {
        class c { // violation 'Class c should be declared as final'
            private c() {
            }
        }
    }

    class k {
        c obj = new c() {
        };

        class c {
            private c() {
            }
        }
    }

    record s() {
        record f() {
            class j { // violation 'Class j should be declared as final'
                private j() {
                }
            }
        }
    }

    static class h {
        record f() {
            final static j obj = new j() {
            };

            static class j {
                private j() {
                }
            }
        }
    }
    private class Nothing { // violation 'Class Nothing should be declared as final'
    }
}
