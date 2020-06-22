
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
    "stars",
    "value",
    "name",
    "target",
    "info",
    "completionInfo",
    "village"
})
public class Achievement implements Serializable
{

    @JsonProperty("stars")
    private Long stars;
    @JsonProperty("value")
    private Long value;
    @JsonProperty("name")
    private Name_____ name;
    @JsonProperty("target")
    private Long target;
    @JsonProperty("info")
    private Info info;
    @JsonProperty("completionInfo")
    private CompletionInfo completionInfo;
    @JsonProperty("village")
    private String village;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 186857618087800020L;

    @JsonProperty("stars")
    public Long getStars() {
        return stars;
    }

    @JsonProperty("stars")
    public void setStars(Long stars) {
        this.stars = stars;
    }

    @JsonProperty("value")
    public Long getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Long value) {
        this.value = value;
    }

    @JsonProperty("name")
    public Name_____ getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(Name_____ name) {
        this.name = name;
    }

    @JsonProperty("target")
    public Long getTarget() {
        return target;
    }

    @JsonProperty("target")
    public void setTarget(Long target) {
        this.target = target;
    }

    @JsonProperty("info")
    public Info getInfo() {
        return info;
    }

    @JsonProperty("info")
    public void setInfo(Info info) {
        this.info = info;
    }

    @JsonProperty("completionInfo")
    public CompletionInfo getCompletionInfo() {
        return completionInfo;
    }

    @JsonProperty("completionInfo")
    public void setCompletionInfo(CompletionInfo completionInfo) {
        this.completionInfo = completionInfo;
    }

    @JsonProperty("village")
    public String getVillage() {
        return village;
    }

    @JsonProperty("village")
    public void setVillage(String village) {
        this.village = village;
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
