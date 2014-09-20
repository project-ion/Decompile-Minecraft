/*  1:   */ import com.mojang.authlib.GameProfile;
/*  2:   */ 
/*  3:   */ public class cjd
/*  4:   */ {
/*  5:21 */   public static cjd a = new cjd();
/*  6:23 */   private bcr b = new bcr(0);
/*  7:24 */   private bcr c = new bcr(1);
/*  8:25 */   private bda d = new bda();
/*  9:26 */   private bci e = new bci();
/* 10:27 */   private bdm f = new bdm();
/* 11:   */   
/* 12:   */   public void a(amj paramamj)
/* 13:   */   {
/* 14:30 */     if (paramamj.b() == amk.cE)
/* 15:   */     {
/* 16:31 */       this.e.a(paramamj);
/* 17:32 */       cno.a.a(this.e, 0.0D, 0.0D, 0.0D, 0.0F);
/* 18:   */     }
/* 19:   */     else
/* 20:   */     {
/* 21:   */       Object localObject;
/* 22:33 */       if (paramamj.b() == amk.bX)
/* 23:   */       {
/* 24:34 */         localObject = null;
/* 25:35 */         if (paramamj.n())
/* 26:   */         {
/* 27:36 */           fn localfn = paramamj.o();
/* 28:38 */           if (localfn.b("SkullOwner", 10))
/* 29:   */           {
/* 30:39 */             localObject = ga.a(localfn.m("SkullOwner"));
/* 31:   */           }
/* 32:40 */           else if ((localfn.b("SkullOwner", 8)) && (localfn.j("SkullOwner").length() > 0))
/* 33:   */           {
/* 34:41 */             localObject = new GameProfile(null, localfn.j("SkullOwner"));
/* 35:42 */             localObject = bdm.b((GameProfile)localObject);
/* 36:43 */             localfn.o("SkullOwner");
/* 37:44 */             localfn.a("SkullOwner", ga.a(new fn(), (GameProfile)localObject));
/* 38:   */           }
/* 39:   */         }
/* 40:47 */         if (cnw.c != null)
/* 41:   */         {
/* 42:48 */           cjm.E();
/* 43:49 */           cjm.b(-0.5F, 0.0F, -0.5F);
/* 44:50 */           cjm.a(2.0F, 2.0F, 2.0F);
/* 45:51 */           cjm.p();
/* 46:52 */           cnw.c.a(0.0F, 0.0F, 0.0F, ej.b, 0.0F, paramamj.i(), (GameProfile)localObject, -1);
/* 47:53 */           cjm.o();
/* 48:54 */           cjm.F();
/* 49:   */         }
/* 50:   */       }
/* 51:   */       else
/* 52:   */       {
/* 53:57 */         localObject = atr.a(paramamj.b());
/* 54:58 */         if (localObject == aty.bQ) {
/* 55:59 */           cno.a.a(this.d, 0.0D, 0.0D, 0.0D, 0.0F);
/* 56:60 */         } else if (localObject == aty.cg) {
/* 57:61 */           cno.a.a(this.c, 0.0D, 0.0D, 0.0D, 0.0F);
/* 58:   */         } else {
/* 59:63 */           cno.a.a(this.b, 0.0D, 0.0D, 0.0D, 0.0F);
/* 60:   */         }
/* 61:   */       }
/* 62:   */     }
/* 63:   */   }
/* 64:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cjd
 * JD-Core Version:    0.7.0.1
 */