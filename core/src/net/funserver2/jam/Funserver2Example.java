package net.funserver2.jam;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Funserver2Example extends ApplicationAdapter
{
	private Texture dropImage;
	private Texture bucketImage;
	private Sound dropSound;
	private Music rainMusic;
	
	@Override
	public void create()
	{
		dropImage = new Texture(Gdx.files.internal("droplet.png"));

	}

	@Override
	public void render()
	{

	}
}
