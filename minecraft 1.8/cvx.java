/*  1:   */ import com.google.common.cache.CacheLoader;
/*  2:   */ import com.mojang.authlib.GameProfile;
/*  3:   */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*  4:   */ import java.util.Map;
/*  5:   */ 
/*  6:   */ class cvx
/*  7:   */   extends CacheLoader
/*  8:   */ {
/*  9:   */   cvx(cvw paramcvw) {}
/* 10:   */   
/* 11:   */   public Map a(GameProfile paramGameProfile)
/* 12:   */   {
/* 13:47 */     return bsu.z().Y().getTextures(paramGameProfile, false);
/* 14:   */   }
/* 15:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cvx
 * JD-Core Version:    0.7.0.1
 */