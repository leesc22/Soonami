package com.github.leesc22.soonami

/**
 * {@Event} represents an earthquake event. It holds the details
 * of that event such as title (which contains magnitude and location
 * of the earthquake), as well as time, and whether or not a tsunami
 * alert was issued during the earthquake.
 *
 * Constructs a new {@link Event}.
 *
 * @param title is the title of the earthquake event
 * @param time is the time the earhtquake happened
 * @param tsunamiAlert is whether or not a tsunami alert was issued
 */
class Event constructor(var title: String, var time: Long, var tsunamiAlert: Int)