package com.example.resttemplatewebclient.api.apiResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PagedResponse<T> {
    private List<T> pagedList;
    private int pageNo;
    private int pageSize;
    private int totalSize;

}
