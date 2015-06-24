/*
 * Tanaguru - Automated webpage assessment
 * Copyright (C) 2008-2015 Tanaguru.org
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact us by mail: tanaguru AT tanaguru DOT org
 */
package org.tanaguru.rules.rgaa30;

import org.tanaguru.ruleimplementation.AbstractNotTestedRuleImplementation;

/**
 * Implementation of the rule 1.2.2 of the referential Rgaa 3.0.
 * <br/>
 * For more details about the implementation, refer to <a
 * href="http://tanaguru-rules-rgaa3.readthedocs.org/en/latest/Rule-1-2-2">the rule 1.2.2
 * design page.</a>
 *
 * @see <a
 * href="http://references.modernisation.gouv.fr/referentiel-technique-0#test-1-2-2">
 * 1.2.2 rule specification</a>
 *
 */
public class Rgaa30Rule010202  extends AbstractNotTestedRuleImplementation {

    /**
     * Default constructor
     */
    public Rgaa30Rule010202 () {
        super();
    }

//extends AbstractMarkerPageRuleImplementation {
//
//    /**
//     * Default constructor
//     */
//    public Rgaa30Rule010202() {
//        super(
//                // the decorative images are part of the scope
//                DECORATIVE_IMAGE_MARKER,
//                // the informative images are not part of the scope
//                INFORMATIVE_IMAGE_MARKER);
//        setElementSelector(new ImageElementSelector(new AreaElementSelector(true, true, false), true, false));
//        setMarkerElementChecker(getMarkerElementChecker());
//        setRegularElementChecker(getLocalRegularElementChecker());
//    }
//
//    /**
//     *
//     * @return the checker user for marked elements
//     */
//    private ElementChecker getMarkerElementChecker() {
//        // checker for elements identified by marker
//        return new CompositeChecker(
//                new TextEmptinessChecker(
//                    new TextAttributeOfElementBuilder(ALT_ATTR),
//                    // solution when attribute is empty
//                    TestSolution.PASSED,
//                    // solution when attribute is not empty
//                    TestSolution.FAILED,
//                    null, // no message created when a decorative with empty alt is found
//                    DECORATIVE_ELEMENT_WITH_NOT_EMPTY_ALT_MSG,
//                    ALT_ATTR),
//                new AttributePresenceChecker(
//                    TITLE_ATTR,
//                    TestSolution.FAILED,
//                    TestSolution.PASSED,
//                    CHECK_PRESENCE_ELEMENT_TITLE_MSG,
//                    CHECK_NOT_PRESENCE_ELEMENT_TITLE_MSG,
//                    TITLE_ATTR,
//                    SRC_ATTR)
//        );
//    }
//    
//    /**
//     * 
//     * @return the checker user for not marked elements
//     */
//    private ElementChecker getLocalRegularElementChecker() {
//        
//        CompositeChecker compositeChecker = new CompositeChecker();
//        
//        compositeChecker.addChecker(
//                new TextEmptinessChecker(
//                        new TextAttributeOfElementBuilder(ALT_ATTR),
//                        TestSolution.PASSED,
//                        TestSolution.FAILED,
//                        null,
//                        null));
//        
//        compositeChecker.addChecker(
//                new AttributePresenceChecker(
//                        TITLE_ATTR,
//                        TestSolution.FAILED,
//                        TestSolution.PASSED,
//                        null,
//                        null));
//        
//        compositeChecker.setIsOrCombinaison(false);
//        
//        compositeChecker.addCheckMessageFromSolution(
//                TestSolution.PASSED,
//                Collections.singletonMap(
//                        TestSolution.NEED_MORE_INFO, 
//                        DECORATIVE_ELEMENT_WITH_NOT_EMPTY_ALT_MSG));
//        compositeChecker.addCheckMessageFromSolution(
//                TestSolution.FAILED,
//                Collections.singletonMap(
//                        TestSolution.NEED_MORE_INFO, 
//                        DECORATIVE_ELEMENT_WITH_NOT_EMPTY_ALT_MSG));
//        
//        return compositeChecker;
//    }
}