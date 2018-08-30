from django.db import models

# Create your models here.

class Artist(models.Model):
    name = models.CharField(max_length=255)

    def __str__(self):
        return self.name

class Album(models.Model):
    title = models.CharField(max_length=255)
    year = models.IntegerField()
    stock_level = models.IntegerField()
    artist = models.ForeignKey(Artist, on_delete=models.CASCADE)

    def __str__(self):
        return slef.title
