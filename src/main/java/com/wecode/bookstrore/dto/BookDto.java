package com.wecode.bookstrore.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author leonid.barsucovschi
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    private String title;

}
