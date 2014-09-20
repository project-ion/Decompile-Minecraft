/*  1:   */ import com.mojang.authlib.minecraft.MinecraftProfileTexture;
/*  2:   */ import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
/*  3:   */ import java.awt.image.BufferedImage;
/*  4:   */ 
/*  5:   */ class cvy
/*  6:   */   implements ckh
/*  7:   */ {
/*  8:   */   cvy(cvw paramcvw, ckh paramckh, cwb paramcwb, MinecraftProfileTexture.Type paramType, oa paramoa, MinecraftProfileTexture paramMinecraftProfileTexture) {}
/*  9:   */   
/* 10:   */   public BufferedImage a(BufferedImage paramBufferedImage)
/* 11:   */   {
/* 12:71 */     if (this.a != null) {
/* 13:72 */       paramBufferedImage = this.a.a(paramBufferedImage);
/* 14:   */     }
/* 15:74 */     return paramBufferedImage;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void a()
/* 19:   */   {
/* 20:79 */     if (this.a != null) {
/* 21:80 */       this.a.a();
/* 22:   */     }
/* 23:82 */     if (this.b != null) {
/* 24:83 */       this.b.a(this.c, this.d, this.e);
/* 25:   */     }
/* 26:   */   }
/* 27:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cvy
 * JD-Core Version:    0.7.0.1
 */