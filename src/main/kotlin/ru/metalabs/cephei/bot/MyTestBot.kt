package ru.metalabs.cephei.bot

import org.telegram.telegrambots.api.objects.Update
import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.exceptions.TelegramApiException
import org.telegram.telegrambots.api.methods.send.SendMessage


class MyTestBot : TelegramLongPollingBot() {
    override fun getBotToken(): String {
        return "414824939:AAGnPrnU8wFWMVoK2-eWpcLECy-Y37kQl48"
    }

    override fun getBotUsername(): String {
        return "PqDnTestbot"
    }

    override fun onUpdateReceived(update: Update?) {
        if (update != null && update.hasMessage() && update.message.hasText()) {
            val text = update.message.text + " - answer"
            val chatId = update.message.chatId

            val message = SendMessage()
                    .setChatId(chatId)
                    .setText(text)
            try {
                execute(message)
            } catch (e: TelegramApiException) {
                e.printStackTrace()
            }
        }
    }
}