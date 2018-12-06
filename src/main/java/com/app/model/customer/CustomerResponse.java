package com.app.model.customer;

import com.app.model.response.PageResponse;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class CustomerResponse extends PageResponse {
    @ApiModelProperty(required = true, value = "")
    private List<Customer> items;

    public List<Customer> getItems() {
        return items;
    }

    public void setItems(List<Customer> items) {
        this.items = items;
    }
}
