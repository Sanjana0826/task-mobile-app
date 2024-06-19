package com.example.tasks.Database



import androidx.lifecycle.LiveData
import com.example.tasks.Models.Note

class NotesRepository (private val noteDao: NoteDao){

    val allNote : LiveData<List<Note>> = noteDao.getAllNotes()
    suspend fun insert (note: Note){

        noteDao.insert(note)

    }

    suspend fun delete(note: Note){
        noteDao.delete(note)

    }



    suspend fun update(note: Note) {
        noteDao.update(note)
        }

}