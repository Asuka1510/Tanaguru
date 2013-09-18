/*
 *  Tanaguru - Automated webpage assessment
 *  Copyright (C) 2008-2011  Open-S Company
 * 
 *  This file is part of Tanaguru.
 * 
 *  Tanaguru is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 * 
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 *  Contact us by mail: open-s AT open-s DOT com
 */
package org.opens.tanaguru.service.command;

import org.easymock.EasyMock;
import org.opens.tanaguru.entity.audit.AuditStatus;
import org.opens.tanaguru.entity.subject.WebResource;
import org.opens.tanaguru.service.CrawlerService;
import org.opens.tanaguru.util.FileNaming;

/**
 *
 * @author jkowalczyk
 */
public class PageAuditCrawlerCommandImplTest extends AuditCommandTestCase {
    
    private String pageUrl = "My page";
    private CrawlerService mockCrawlerService;
    
    public PageAuditCrawlerCommandImplTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of callCrawlerService method, of class PageAuditCommandImpl.
     */
    public void testCallCrawlerService() {
        System.out.println("callCrawlerService");

        mockInitialisationCalls(true, AuditStatus.CRAWLING);
        
        mockCrawlerService = EasyMock.createMock(CrawlerService.class);
        EasyMock.expect(mockCrawlerService.crawlPage(mockAudit, FileNaming.addProtocolToUrl(pageUrl))).
                andReturn(EasyMock.createMock(WebResource.class))
                .once();
        EasyMock.replay(mockCrawlerService);
        
        PageAuditCrawlerCommandImpl pageAuditCommand = new PageAuditCrawlerCommandImpl(
                pageUrl, 
                null);
        pageAuditCommand.setAuditDataService(mockAuditDataService);
        pageAuditCommand.setTestDataService(mockTestDataService);
        pageAuditCommand.setParameterDataService(mockParameterDataService);
        pageAuditCommand.setWebResourceDataService(mockWebResourceDataService);
        pageAuditCommand.setContentDataService(mockContentDataService);
        pageAuditCommand.setProcessResultDataService(mockProcessResultDataService);
        pageAuditCommand.setPreProcessResultDataService(mockPreProcessResultDataService);
        pageAuditCommand.setContentAdapterService(mockContentAdapterService);
        pageAuditCommand.setProcessorService(mockProcessorService);
        pageAuditCommand.setConsolidatorService(mockConsolidatorService);
        pageAuditCommand.setAnalyserService(mockAnalyserService);
        pageAuditCommand.setAdaptationListener(mockAdaptationListener);
        pageAuditCommand.setCrawlerService(mockCrawlerService);
        pageAuditCommand.setAdaptationTreatmentWindow(5);
        pageAuditCommand.setProcessingTreatmentWindow(5);
        pageAuditCommand.setConsolidationTreatmentWindow(5);
        pageAuditCommand.setAnalyseTreatmentWindow(5);
        
        pageAuditCommand.init();
        
        pageAuditCommand.callCrawlerService();
        
        EasyMock.verify(mockCrawlerService);
        EasyMock.verify(mockAudit);
        EasyMock.verify(mockAuditDataService);
        EasyMock.verify(mockTestDataService);
        EasyMock.verify(mockParameterDataService);
    }
}
