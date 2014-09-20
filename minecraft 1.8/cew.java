/*  1:   */ public class cew
/*  2:   */ {
/*  3:   */   public String a;
/*  4:   */   public String b;
/*  5:   */   public String c;
/*  6:   */   public String d;
/*  7:   */   public long e;
/*  8:15 */   public int f = 47;
/*  9:16 */   public String g = "1.8";
/* 10:   */   public boolean h;
/* 11:   */   public String i;
/* 12:19 */   private cex j = cex.c;
/* 13:   */   private String k;
/* 14:   */   
/* 15:   */   public cew(String paramString1, String paramString2)
/* 16:   */   {
/* 17:23 */     this.a = paramString1;
/* 18:24 */     this.b = paramString2;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public fn a()
/* 22:   */   {
/* 23:28 */     fn localfn = new fn();
/* 24:29 */     localfn.a("name", this.a);
/* 25:30 */     localfn.a("ip", this.b);
/* 26:32 */     if (this.k != null) {
/* 27:33 */       localfn.a("icon", this.k);
/* 28:   */     }
/* 29:36 */     if (this.j == cex.a) {
/* 30:37 */       localfn.a("acceptTextures", true);
/* 31:38 */     } else if (this.j == cex.b) {
/* 32:39 */       localfn.a("acceptTextures", false);
/* 33:   */     }
/* 34:42 */     return localfn;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public cex b()
/* 38:   */   {
/* 39:46 */     return this.j;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void a(cex paramcex)
/* 43:   */   {
/* 44:50 */     this.j = paramcex;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public static cew a(fn paramfn)
/* 48:   */   {
/* 49:54 */     cew localcew = new cew(paramfn.j("name"), paramfn.j("ip"));
/* 50:56 */     if (paramfn.b("icon", 8)) {
/* 51:57 */       localcew.a(paramfn.j("icon"));
/* 52:   */     }
/* 53:60 */     if (paramfn.b("acceptTextures", 1))
/* 54:   */     {
/* 55:61 */       if (paramfn.n("acceptTextures")) {
/* 56:62 */         localcew.a(cex.a);
/* 57:   */       } else {
/* 58:64 */         localcew.a(cex.b);
/* 59:   */       }
/* 60:   */     }
/* 61:   */     else {
/* 62:67 */       localcew.a(cex.c);
/* 63:   */     }
/* 64:70 */     return localcew;
/* 65:   */   }
/* 66:   */   
/* 67:   */   public String c()
/* 68:   */   {
/* 69:74 */     return this.k;
/* 70:   */   }
/* 71:   */   
/* 72:   */   public void a(String paramString)
/* 73:   */   {
/* 74:78 */     this.k = paramString;
/* 75:   */   }
/* 76:   */   
/* 77:   */   public void a(cew paramcew)
/* 78:   */   {
/* 79:82 */     this.b = paramcew.b;
/* 80:83 */     this.a = paramcew.a;
/* 81:84 */     a(paramcew.b());
/* 82:85 */     this.k = paramcew.k;
/* 83:   */   }
/* 84:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cew
 * JD-Core Version:    0.7.0.1
 */