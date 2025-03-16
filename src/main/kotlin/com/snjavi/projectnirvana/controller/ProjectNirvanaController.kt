package com.snjavi.projectnirvana.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
public class ProjectNirvanaController {
    @GetMapping("/visnja")
    fun index():ResponseEntity<Song> {
        val song = Song(artist = "Song Artist", album = "Album", url = "https://api.soundcloud.com/tracks/1955103523", name =  "Song Name")
        return ResponseEntity.ok().body(song)
    }
}