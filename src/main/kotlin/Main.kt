fun main() {
    //Создадим несколько постов и добавим их на стену
    WallService.add(Post(authorId = 1, authorName = "test", content = "Test content", created = 20220423, likes = 0))
    WallService.add(Post(authorId = 2, authorName = "user", content = "Test content 1", created = 20220425, likes = 0))
    WallService.add(Post(authorId = 1, authorName = "test", content = "Test content 2", created = 20220425, likes = 0))


    WallService.update(Post(2, 3, "user", "Content after updating", 19990105, 16))

    //Создадим пост с вложениями "Заметка" и "Аудио"
    val attachmentsList: List<Attachments>
    attachmentsList = listOf(
        AttachmentNote(
            Note(1, 3, 20220515, "Первая заметка", "Это первая заметка", 0)
        ),
        AttachmentAudio(
            Audio(1, 3, 20220515, "Unknown", 120, 1)
        )
    )
    WallService.add(
        Post(
            authorId = 3,
            authorName = "Dmitry",
            content = "Пост с вложениями \"Заметка\" и \"Аудио\"",
            created = 20220515,
            likes = 1,
            attachments = attachmentsList
        )
    )
}