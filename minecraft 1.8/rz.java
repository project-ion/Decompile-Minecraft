/*  1:   */ import com.mojang.authlib.GameProfile;
/*  2:   */ import com.mojang.authlib.ProfileLookupCallback;
/*  3:   */ 
/*  4:   */ final class rz
/*  5:   */   implements ProfileLookupCallback
/*  6:   */ {
/*  7:   */   rz(GameProfile[] paramArrayOfGameProfile) {}
/*  8:   */   
/*  9:   */   public void onProfileLookupSucceeded(GameProfile paramGameProfile)
/* 10:   */   {
/* 11:50 */     this.a[0] = paramGameProfile;
/* 12:   */   }
/* 13:   */   
/* 14:   */   public void onProfileLookupFailed(GameProfile paramGameProfile, Exception paramException)
/* 15:   */   {
/* 16:55 */     this.a[0] = null;
/* 17:   */   }
/* 18:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     rz
 * JD-Core Version:    0.7.0.1
 */