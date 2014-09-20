/*  1:   */ import com.mojang.authlib.GameProfile;
/*  2:   */ 
/*  3:   */ public class ni
/*  4:   */   implements id
/*  5:   */ {
/*  6:   */   private GameProfile a;
/*  7:   */   
/*  8:   */   public ni() {}
/*  9:   */   
/* 10:   */   public ni(GameProfile paramGameProfile)
/* 11:   */   {
/* 12:18 */     this.a = paramGameProfile;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void a(hd paramhd)
/* 16:   */   {
/* 17:23 */     this.a = new GameProfile(null, paramhd.c(16));
/* 18:   */   }
/* 19:   */   
/* 20:   */   public void b(hd paramhd)
/* 21:   */   {
/* 22:28 */     paramhd.a(this.a.getName());
/* 23:   */   }
/* 24:   */   
/* 25:   */   public void a(nh paramnh)
/* 26:   */   {
/* 27:33 */     paramnh.a(this);
/* 28:   */   }
/* 29:   */   
/* 30:   */   public GameProfile a()
/* 31:   */   {
/* 32:37 */     return this.a;
/* 33:   */   }
/* 34:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ni
 * JD-Core Version:    0.7.0.1
 */