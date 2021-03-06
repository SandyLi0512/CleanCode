package com.epam.engx.cleancode.naming.task1;

import com.epam.engx.cleancode.naming.task1.thirdpartyjar.Message;
import com.epam.engx.cleancode.naming.task1.thirdpartyjar.Submittable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CollectOrderServiceTest {

    private static final int INFO_LEVEL = 4;
    private static final int CRITICAL_LEVEL = 1;

    private CollectOrderServiceTestHelper helper = new CollectOrderServiceTestHelper();

    private final Submittable collectOrderService = helper.getService();

    private final NotificationManagerMock notificationManagerMock = new NotificationManagerMock();

    @Test
    public void shouldSubmitCollectionOrder() {
        helper.setCollectionService(collectOrderService, new TrueCollectionServiceStub());
        helper.setNotificationManager(notificationManagerMock, collectOrderService);

        helper.submit(collectOrderService);

        assertEquals(INFO_LEVEL, notificationManagerMock.level);
        assertEquals(Message.READY_FOR_COLLECT, notificationManagerMock.message);
    }

    @Test
    public void shouldNotSubmitCollectionOrder() {
        helper.setCollectionService(collectOrderService, new FalseCollectionServiceStub());
        helper.setNotificationManager(notificationManagerMock, collectOrderService);

        helper.submit(collectOrderService);

        assertEquals(CRITICAL_LEVEL, notificationManagerMock.level);
        assertEquals(Message.IMPOSSIBLE_TO_COLLECT, notificationManagerMock.message);
    }

}
