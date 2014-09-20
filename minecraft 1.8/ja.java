/*  1:   */ public class ja
/*  2:   */   implements id
/*  3:   */ {
/*  4:   */   private aqm a;
/*  5:   */   private jb[] b;
/*  6:   */   
/*  7:   */   public ja() {}
/*  8:   */   
/*  9:   */   public ja(int paramInt, short[] paramArrayOfShort, bfh parambfh)
/* 10:   */   {
/* 11:22 */     this.a = new aqm(parambfh.a, parambfh.b);
/* 12:   */     
/* 13:24 */     this.b = new jb[paramInt];
/* 14:25 */     for (int i = 0; i < this.b.length; i++) {
/* 15:26 */       this.b[i] = new jb(this, paramArrayOfShort[i], parambfh);
/* 16:   */     }
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void a(hd paramhd)
/* 20:   */   {
/* 21:32 */     this.a = new aqm(paramhd.readInt(), paramhd.readInt());
/* 22:33 */     this.b = new jb[paramhd.e()];
/* 23:35 */     for (int i = 0; i < this.b.length; i++) {
/* 24:36 */       this.b[i] = new jb(this, paramhd.readShort(), (bec)atr.d.a(paramhd.e()));
/* 25:   */     }
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void b(hd paramhd)
/* 29:   */   {
/* 30:42 */     paramhd.writeInt(this.a.a);
/* 31:43 */     paramhd.writeInt(this.a.b);
/* 32:44 */     paramhd.b(this.b.length);
/* 33:45 */     for (jb localjb : this.b)
/* 34:   */     {
/* 35:46 */       paramhd.writeShort(localjb.b());
/* 36:47 */       paramhd.b(atr.d.b(localjb.c()));
/* 37:   */     }
/* 38:   */   }
/* 39:   */   
/* 40:   */   public void a(ik paramik)
/* 41:   */   {
/* 42:53 */     paramik.a(this);
/* 43:   */   }
/* 44:   */   
/* 45:   */   public jb[] a()
/* 46:   */   {
/* 47:57 */     return this.b;
/* 48:   */   }
/* 49:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ja
 * JD-Core Version:    0.7.0.1
 */