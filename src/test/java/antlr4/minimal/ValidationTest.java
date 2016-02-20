/**
 * Copyright 2016 Sebastian Proksch
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package antlr4.minimal;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ValidationTest {

    private Validation sut;

    @Before
    public void setup() {
        sut = new Validation();
    }

    @Test
    public void ex1() {
        assertValid("Hello world!");
    }

    @Test
    public void ex2() {
        assertInvalid("Hello World");
    }

    @Test
    public void ex3() {
        assertInvalid("Hello Word!");
    }

    private void assertValid(String input) {
        assertTrue(sut.parse(input));
    }

    private void assertInvalid(String input) {
        assertFalse(sut.parse(input));
    }
}