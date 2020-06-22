
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
    "previousSeason",
    "bestSeason",
    "previousVersusSeason",
    "bestVersusSeason",
    "legendTrophies",
    "currentSeason"
})
public class LegendStatistics implements Serializable
{

    @JsonProperty("previousSeason")
    private PreviousSeason previousSeason;
    @JsonProperty("bestSeason")
    private BestSeason bestSeason;
    @JsonProperty("previousVersusSeason")
    private PreviousVersusSeason previousVersusSeason;
    @JsonProperty("bestVersusSeason")
    private BestVersusSeason bestVersusSeason;
    @JsonProperty("legendTrophies")
    private Long legendTrophies;
    @JsonProperty("currentSeason")
    private CurrentSeason currentSeason;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 276831052453161095L;

    @JsonProperty("previousSeason")
    public PreviousSeason getPreviousSeason() {
        return previousSeason;
    }

    @JsonProperty("previousSeason")
    public void setPreviousSeason(PreviousSeason previousSeason) {
        this.previousSeason = previousSeason;
    }

    @JsonProperty("bestSeason")
    public BestSeason getBestSeason() {
        return bestSeason;
    }

    @JsonProperty("bestSeason")
    public void setBestSeason(BestSeason bestSeason) {
        this.bestSeason = bestSeason;
    }

    @JsonProperty("previousVersusSeason")
    public PreviousVersusSeason getPreviousVersusSeason() {
        return previousVersusSeason;
    }

    @JsonProperty("previousVersusSeason")
    public void setPreviousVersusSeason(PreviousVersusSeason previousVersusSeason) {
        this.previousVersusSeason = previousVersusSeason;
    }

    @JsonProperty("bestVersusSeason")
    public BestVersusSeason getBestVersusSeason() {
        return bestVersusSeason;
    }

    @JsonProperty("bestVersusSeason")
    public void setBestVersusSeason(BestVersusSeason bestVersusSeason) {
        this.bestVersusSeason = bestVersusSeason;
    }

    @JsonProperty("legendTrophies")
    public Long getLegendTrophies() {
        return legendTrophies;
    }

    @JsonProperty("legendTrophies")
    public void setLegendTrophies(Long legendTrophies) {
        this.legendTrophies = legendTrophies;
    }

    @JsonProperty("currentSeason")
    public CurrentSeason getCurrentSeason() {
        return currentSeason;
    }

    @JsonProperty("currentSeason")
    public void setCurrentSeason(CurrentSeason currentSeason) {
        this.currentSeason = currentSeason;
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
