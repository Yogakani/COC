
package com.yoga.coc.conroller.response;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "id",
    "iconUrls"
})
public class Label implements Serializable
{

    @JsonProperty("name")
    private Name____ name;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("iconUrls")
    private IconUrls_ iconUrls;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4557610270157353430L;

    @JsonProperty("name")
    public Name____ getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(Name____ name) {
        this.name = name;
    }

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("iconUrls")
    public IconUrls_ getIconUrls() {
        return iconUrls;
    }

    @JsonProperty("iconUrls")
    public void setIconUrls(IconUrls_ iconUrls) {
        this.iconUrls = iconUrls;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
