package com.redhat.labs.omp.model.event;

import java.util.List;

import com.redhat.labs.omp.model.Engagement;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BackendEvent {

    private EventType eventType;
    private List<Engagement> engagementList;
    @Builder.Default
    private boolean forceUpdate = false;

    public static BackendEvent createDatabaseRefreshRequestedEvent(boolean forceUpdate) {
        return BackendEvent.builder().eventType(EventType.DB_REFRESH_REQUESTED).forceUpdate(forceUpdate).build();
    }

    public static BackendEvent createDatabaseRefreshEvent(List<Engagement> engagmentList, boolean forceUpdate) {
        return BackendEvent.builder().eventType(EventType.DB_REFRESH).engagementList(engagmentList)
                .forceUpdate(forceUpdate).build();
    }

    public static BackendEvent createPushToGitRequestedEvent() {
        return BackendEvent.builder().eventType(EventType.PUSH_TO_GIT_REQUESTED).build();
    }

    public static BackendEvent createUpdateEngagementsInDbRequestedEvent(List<Engagement> engagementList) {
        return BackendEvent.builder().eventType(EventType.UPDATE_ENGAGEMENTS_IN_DB_REQUESTED)
                .engagementList(engagementList).build();
    }

    public static BackendEvent createUpdateEngagementsInGitRequestedEvent(List<Engagement> engagementList) {
        return BackendEvent.builder().eventType(EventType.UPDATE_ENGAGEMENTS_IN_GIT_REQUESTED)
                .engagementList(engagementList).build();
    }

}