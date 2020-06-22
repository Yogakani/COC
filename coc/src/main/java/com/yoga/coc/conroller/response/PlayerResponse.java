
package com.yoga.coc.conroller.response;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "clan",
    "league",
    "role",
    "attackWins",
    "defenseWins",
    "townHallLevel",
    "townHallWeaponLevel",
    "versusBattleWins",
    "legendStatistics",
    "troops",
    "heroes",
    "spells",
    "labels",
    "tag",
    "name",
    "expLevel",
    "trophies",
    "bestTrophies",
    "donations",
    "donationsReceived",
    "builderHallLevel",
    "versusTrophies",
    "bestVersusTrophies",
    "warStars",
    "achievements",
    "versusBattleWinCount"
})
public class PlayerResponse implements Serializable
{

    @JsonProperty("clan")
    private Clan clan;
    @JsonProperty("league")
    private League league;
    @JsonProperty("role")
    private String role;
    @JsonProperty("attackWins")
    private Long attackWins;
    @JsonProperty("defenseWins")
    private Long defenseWins;
    @JsonProperty("townHallLevel")
    private Long townHallLevel;
    @JsonProperty("townHallWeaponLevel")
    private Long townHallWeaponLevel;
    @JsonProperty("versusBattleWins")
    private Long versusBattleWins;
    @JsonProperty("legendStatistics")
    private LegendStatistics legendStatistics;
    @JsonProperty("troops")
    private List<Troop> troops = null;
    @JsonProperty("heroes")
    private List<Hero> heroes = null;
    @JsonProperty("spells")
    private List<Spell> spells = null;
    @JsonProperty("labels")
    private List<Label> labels = null;
    @JsonProperty("tag")
    private String tag;
    @JsonProperty("name")
    private String name;
    @JsonProperty("expLevel")
    private Long expLevel;
    @JsonProperty("trophies")
    private Long trophies;
    @JsonProperty("bestTrophies")
    private Long bestTrophies;
    @JsonProperty("donations")
    private Long donations;
    @JsonProperty("donationsReceived")
    private Long donationsReceived;
    @JsonProperty("builderHallLevel")
    private Long builderHallLevel;
    @JsonProperty("versusTrophies")
    private Long versusTrophies;
    @JsonProperty("bestVersusTrophies")
    private Long bestVersusTrophies;
    @JsonProperty("warStars")
    private Long warStars;
    @JsonProperty("achievements")
    private List<Achievement> achievements = null;
    @JsonProperty("versusBattleWinCount")
    private Long versusBattleWinCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4678886316257465113L;

    @JsonProperty("clan")
    public Clan getClan() {
        return clan;
    }

    @JsonProperty("clan")
    public void setClan(Clan clan) {
        this.clan = clan;
    }

    @JsonProperty("league")
    public League getLeague() {
        return league;
    }

    @JsonProperty("league")
    public void setLeague(League league) {
        this.league = league;
    }

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    @JsonProperty("attackWins")
    public Long getAttackWins() {
        return attackWins;
    }

    @JsonProperty("attackWins")
    public void setAttackWins(Long attackWins) {
        this.attackWins = attackWins;
    }

    @JsonProperty("defenseWins")
    public Long getDefenseWins() {
        return defenseWins;
    }

    @JsonProperty("defenseWins")
    public void setDefenseWins(Long defenseWins) {
        this.defenseWins = defenseWins;
    }

    @JsonProperty("townHallLevel")
    public Long getTownHallLevel() {
        return townHallLevel;
    }

    @JsonProperty("townHallLevel")
    public void setTownHallLevel(Long townHallLevel) {
        this.townHallLevel = townHallLevel;
    }

    @JsonProperty("townHallWeaponLevel")
    public Long getTownHallWeaponLevel() {
        return townHallWeaponLevel;
    }

    @JsonProperty("townHallWeaponLevel")
    public void setTownHallWeaponLevel(Long townHallWeaponLevel) {
        this.townHallWeaponLevel = townHallWeaponLevel;
    }

    @JsonProperty("versusBattleWins")
    public Long getVersusBattleWins() {
        return versusBattleWins;
    }

    @JsonProperty("versusBattleWins")
    public void setVersusBattleWins(Long versusBattleWins) {
        this.versusBattleWins = versusBattleWins;
    }

    @JsonProperty("legendStatistics")
    public LegendStatistics getLegendStatistics() {
        return legendStatistics;
    }

    @JsonProperty("legendStatistics")
    public void setLegendStatistics(LegendStatistics legendStatistics) {
        this.legendStatistics = legendStatistics;
    }

    @JsonProperty("troops")
    public List<Troop> getTroops() {
        return troops;
    }

    @JsonProperty("troops")
    public void setTroops(List<Troop> troops) {
        this.troops = troops;
    }

    @JsonProperty("heroes")
    public List<Hero> getHeroes() {
        return heroes;
    }

    @JsonProperty("heroes")
    public void setHeroes(List<Hero> heroes) {
        this.heroes = heroes;
    }

    @JsonProperty("spells")
    public List<Spell> getSpells() {
        return spells;
    }

    @JsonProperty("spells")
    public void setSpells(List<Spell> spells) {
        this.spells = spells;
    }

    @JsonProperty("labels")
    public List<Label> getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    @JsonProperty("tag")
    public String getTag() {
        return tag;
    }

    @JsonProperty("tag")
    public void setTag(String tag) {
        this.tag = tag;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("expLevel")
    public Long getExpLevel() {
        return expLevel;
    }

    @JsonProperty("expLevel")
    public void setExpLevel(Long expLevel) {
        this.expLevel = expLevel;
    }

    @JsonProperty("trophies")
    public Long getTrophies() {
        return trophies;
    }

    @JsonProperty("trophies")
    public void setTrophies(Long trophies) {
        this.trophies = trophies;
    }

    @JsonProperty("bestTrophies")
    public Long getBestTrophies() {
        return bestTrophies;
    }

    @JsonProperty("bestTrophies")
    public void setBestTrophies(Long bestTrophies) {
        this.bestTrophies = bestTrophies;
    }

    @JsonProperty("donations")
    public Long getDonations() {
        return donations;
    }

    @JsonProperty("donations")
    public void setDonations(Long donations) {
        this.donations = donations;
    }

    @JsonProperty("donationsReceived")
    public Long getDonationsReceived() {
        return donationsReceived;
    }

    @JsonProperty("donationsReceived")
    public void setDonationsReceived(Long donationsReceived) {
        this.donationsReceived = donationsReceived;
    }

    @JsonProperty("builderHallLevel")
    public Long getBuilderHallLevel() {
        return builderHallLevel;
    }

    @JsonProperty("builderHallLevel")
    public void setBuilderHallLevel(Long builderHallLevel) {
        this.builderHallLevel = builderHallLevel;
    }

    @JsonProperty("versusTrophies")
    public Long getVersusTrophies() {
        return versusTrophies;
    }

    @JsonProperty("versusTrophies")
    public void setVersusTrophies(Long versusTrophies) {
        this.versusTrophies = versusTrophies;
    }

    @JsonProperty("bestVersusTrophies")
    public Long getBestVersusTrophies() {
        return bestVersusTrophies;
    }

    @JsonProperty("bestVersusTrophies")
    public void setBestVersusTrophies(Long bestVersusTrophies) {
        this.bestVersusTrophies = bestVersusTrophies;
    }

    @JsonProperty("warStars")
    public Long getWarStars() {
        return warStars;
    }

    @JsonProperty("warStars")
    public void setWarStars(Long warStars) {
        this.warStars = warStars;
    }

    @JsonProperty("achievements")
    public List<Achievement> getAchievements() {
        return achievements;
    }

    @JsonProperty("achievements")
    public void setAchievements(List<Achievement> achievements) {
        this.achievements = achievements;
    }

    @JsonProperty("versusBattleWinCount")
    public Long getVersusBattleWinCount() {
        return versusBattleWinCount;
    }

    @JsonProperty("versusBattleWinCount")
    public void setVersusBattleWinCount(Long versusBattleWinCount) {
        this.versusBattleWinCount = versusBattleWinCount;
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
