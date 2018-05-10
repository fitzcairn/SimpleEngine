package com.stevezero.gmscrusader.game.services;

/**
 * Wrapper class to manage connected services.
 */
public class ServiceManager {
  private final Achievements achievements;
  private final Leaderboards leaderboards;
  
  public ServiceManager(Achievements achievements, Leaderboards leaderboards) {
    this.achievements = achievements;
    this.leaderboards = leaderboards;
  }
  
  public Achievements getAchievementsService() {
    return achievements;
  }
  
  public Leaderboards getLeaderboardsService() {
    return leaderboards;
  }

}
